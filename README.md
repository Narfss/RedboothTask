#Redbooth task

Redbooth task is an example android application that uses hexagonal architecture and a Rest api.

Architecture
---------------

The hexagonal arquitecture is based in puting all the application **logic** inside the same layer. To this layer will be connected **modules**, those could be, for example a view, an api, a data or others modules. The modules connection to the logic will be through a interface  of logic called **port**. This connection will be adapted with a **boundary**.

In this example the layers are in this directories:
[apiModule](https://github.com/Narfss/RedboothTask/tree/master/app/src/main/java/com/fmsirvent/fmsirventtest2/apiModule)
Module to connected to API Rest.

[dataModule](https://github.com/Narfss/RedboothTask/tree/master/app/src/main/java/com/fmsirvent/fmsirventtest2/dataModule)
Module to save and load local data.

[logicCore](https://github.com/Narfss/RedboothTask/tree/master/app/src/main/java/com/fmsirvent/fmsirventtest2/logicCore)
Logic layer, ports and boundaries.

[view](https://github.com/Narfss/RedboothTask/tree/master/app/src/main/java/com/fmsirvent/fmsirventtest2/view)
Module views and fragments for visual representation.


API
--------
Redbooth api is built in Rest. Here you can read more [about it](https://redbooth.com/api/)

Authentication
----------
The authentication is based on OAuth2. This app opens an activity [view/LoginActivity](https://github.com/Narfss/RedboothTask/blob/master/app/src/main/java/com/fmsirvent/fmsirventtest2/view/LoginActivity.java) with a webview to log in and accept the app. Finally the service returns the token, and is send to the [loginLogic](https://github.com/Narfss/RedboothTask/blob/master/app/src/main/java/com/fmsirvent/fmsirventtest2/logicCore/login/LoginLogic.java) to save it.

Services 
----------
This app, only shows and crate tasks. There are a few services used on [apiModule/ApiServices](https://github.com/Narfss/RedboothTask/blob/master/app/src/main/java/com/fmsirvent/fmsirventtest2/apiModule/ApiServices.java):

[GET api/3/tasks](https://redbooth.com/api/api-docs/#page:tasks,header:tasks-task-list)
List all tasks

[GET api/3/tasks/{id}](https://redbooth.com/api/api-docs/#page:tasks,header:tasks-task-get)
Load data from task

[GET api/3/task_lists](https://redbooth.com/api/api-docs/#page:tasklists,header:tasklists-tasklist-list-get)
Load list of tasks

[POST api/3/tasks](https://redbooth.com/api/api-docs/#page:tasks,header:tasks-task-list-post)
Create task

Views
--------------
All activities are filled with fragments. With this solution, the fragments can be reused in other places or easily moved. For example you can put together the 3 fragments from different activities into a single one with a view pager.

Messages and load
-------------------------
All the fragments extends from [BaseFragment](https://github.com/Narfss/RedboothTask/blob/master/app/src/main/java/com/fmsirvent/fmsirventtest2/view/BaseFragment.java), and all the fragments layouts include a [base_fragment](https://github.com/Narfss/RedboothTask/blob/master/app/src/main/res/layout/base_fragment.xml) layout. This fragment contains the logic and the interface to show success and errors messages.

With this BaseFragment dependency the abstract function *loadData()* must be implemented. This function will be called in case of an error or having to reload data.
To the portView interface the function *notifyError* and *notifySuccess* will be also accesible.

Known problems and errors
-------------------------
With the intention of simplify the logic, the module dataModule, is not integrated in the core in the right way as 'clean code' definition. DataModule is considered without delay, the answer is a return.

Used libraries
----------
[v7 appcompat library](https://developer.android.com/tools/support-library/features.html#v7-appcompat)

[Appsly Android REST](https://github.com/47deg/appsly-android-rest)

[v7 Card view library](https://developer.android.com/tools/support-library/features.html#v7-cardview)

[v7 recyclerview library](https://developer.android.com/tools/support-library/features.html#v7-recyclerview)

[Butter Knife](https://github.com/JakeWharton/butterknife) 

[Crouton](https://github.com/keyboardsurfer/Crouton)

