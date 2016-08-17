# datamodeler-extension
An example Oracle Data Modeler extension.

This source code is related to the article here: http://theriom.com/Example-Oracle-Data-Modeler-Extension

## To build:
* Download JDeveloper

JDeveloper can be downloaded here: http://www.oracle.com/technetwork/developer-tools/jdev/downloads/index.html

* Download the Extension SDK

To get the JDeveloper Extension SDK Documentation and Samples From inside JDeveloper use Help->Check-for-updates

You'll need to restart JDeveloper to complete the installion.

* Change the project to build for DataModeler instead of JDeveloper

Select the project properties (Right Click on the project name).

Under Project Properites Select Extension.
  
Select Manage and add you Data Modeler Installation directory.

> For Mac OS X users, the Installation Directory is OracleDataModeler.app/Contents/Resources/datamodeler  

While still in the Project Properties Section Choose Deployment:

Select the Edit Pencil and change the jar file location to

```
DATAMODELER_PATH/datamodeler/datamodeler/extensions/com.theriom.ExampleExtension.jar
```

So every new build will automatically be saved to the extension folder of DataModeler.

Doing this will ease your development cycle.

Edit:

```
DATAMODELER_PATH/datamodeler/configuration/bundles.info
```

and add

``` com.theriom.ExampleExtension,11.1.1,../datamodeler/extensions/com.theriom.ExampleExtension.jar,4,false
```

* Build and Deploy
