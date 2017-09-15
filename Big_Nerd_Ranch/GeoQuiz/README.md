예제 프로젝트 1. GeoQuiz
---------------------

GeoQuiz는 지역에 대한 퀴즈 게임 프로젝트입니다.  
해당 프로젝트에서는 다음과 같은 개념들을 학습합니다.

* The fundamentals of Android project
* Activity and Layout
* Explicit Intent

### 목차

#### Ch01 Your First Android Application

* App Basics
* Creating an Android Project
* Navigating in Android Studio
* Laying Out the UI
    * The view hierarchy
    * Widget attributes
    * Creating string resources
    * Previewing the layout
* From Layout XML to View Objects
    * Resources and resource IDs
* Wiring Up Widgets
    * Getting references to widgets
    * Setting listeners
* Making Toasts
* Running on the Emulator
* For the More Curious: Android Build Process
    * Android build tools

#### Ch02 Android and Model-View-Controller

* Creating a New Class
    * Generating getters and setters
* Model-View-Controller and Android
    * Benefits of MVC
* Updating the View Layer
* Updating the Controller Layer
* Running on a Device
    * Connecting your device
    * Configuring your device for development
* Adding an Icon
    * Adding resources to a project
    * Referencing resources in XML

#### Ch03 The Activity Lifecycle

* Logging the Activity Lifecycle
    * Making log messages
    * Using Logcat
    * Exploring the activity lifecycle by example
* Rotation and the Activity Lifecycle
    * Device configurations and alternative resources
        * Creating a landscape layout
* Saving Data Across Rotation
    * Overriding onSaveInstanceState(Bundle)
* The Activity Lifecycle, Revisited
* For the More Curious: Current State of Activity Cleanup
* For the More Curious: Log Levels and Methods

#### Ch04 Debugging Android Apps

* Exceptions and Stack Traces
    * Diagnosing misbehaviors
    * Logging stack traces
    * Setting breakpoints
    * Using exception breakpoints
* Android-Specific Debugging
    * Using Android Lint
        * Issues with the R class

#### Ch05 Your Second Activity

* Setting Up a Second Activity
    * Creating a new activity
    * A new activity subclass
    * Declaring activities in the manifest
    * Adding a cheat button to QuizActivity
* Starting an Activity
    * Communicating with intents
        * Explicit and implicit intents
* Passing Data Between Activities
    * Using intent extras
    * Getting a result back from a child activity
        * Setting a result
        * Sending back an intent
        * Handling a result
* How Android Sees Your Activities