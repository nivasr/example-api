# Simple git project with example for creating an API with sprint boot

## To get started:

1. Import the project to local uwing one of the following options
    * Using GIT  
        `git clone https://github.com/nivasr/example-api`  
OR
    * Download
        Use the download option at the top of the github page under "Clone or Download"
        Unzip to a folder.  

    In both options a folder called `api` would be created.

2. Navigate to the folder
    `cd api`

3. Import to IDE
    * eclipse  
        1. `File -> Import -> Maven -> Existing Maven Projects` (If `Maven` does not show up in the `Import` dialog, you need to install the maven plugin for eclipse)
        2. Choose the `api` folder and import
        3. Right Click on the project and Choose `Maven -> Update Project`
        4. Choose `Project` (menu) `-> Clean`
        5. Make sure `Project` (menu) `-> Build Automatically` is checked or select `Project` (menu) `-> Build`
        6. Follow the steps [here](https://crunchify.com/mavenmvn-clean-install-update-project-and-project-clean-options-in-eclipse-ide-to-fix-any-dependency-issue/) if you see errors

4. Compile the Application
    * Right click on the project, and choose `Run As -> Maven clean`, then `Run As -> Maven install`

5. Run the application for testing
    * Right click on the project, and choose `Run As -> Maven build...` and type `spring-boot:run` in `Goals`

6. Go to a browser and type http://localhost:8080/ask?question=help. The value after question= is the question to be passed.

7. Package and Run
    * Follow the steps [here](https://spring.io/guides/gs/rest-service/#_build_an_executable_jar).

## Adding more capabilities

* Class `APIController` (in package dev.nivas.example.api) has all the api end points. 
* It calls `AnswerService.getAnswer`.
* `AnswerService` has all the logic to get the answer for the question.
