예제 프로젝트 1. GeoQuiz
---------------------

GeoQuiz는 지역에 대한 퀴즈 게임 프로젝트입니다.  
해당 프로젝트에서는 다음과 같은 개념들을 학습합니다.

* The fundamentals of Android project
* Activity and Layout
* Explicit Intent

--------------------------------------------------------

### Ch01 Your First Android Application

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

#### 주요 개념

* **activity**
    * An instance of **Activity** class
    * Managing user interaction with a screen of information
  
* **layout**
    * A set of UI objects and their positions on the screen
    * **Widget**
        * An instance of **View** class or one of its subclasses
        * The building blocks you use to compose a UI
        * Every widget has a corresponding **XML element**
            * The name of the element is the type of the widget
            * Each element has a set of **XML attributes**
                * Each attribute is an instruction about how the widget should be configured
  
* View Hierarchy
    * A hierarchy of **View** objects
    * **ViewGroup**
        * A widget that contains and arranges other widgets
  
* **Resource**
    * A piece of your application that is not code
    * image files, audio files, and XML files (layout, strings, etc.)
    * **Resource ID**
        * To access a resource in code
        * integer constant
        * in R.java file
            * Android generated a resource ID for the entire layout and for each string
            * Android did not generated IDs for the individual widgets
  
* How do XML elements become View objects?
    * As part of the build process
        * aapt(Android Asset Packaging Tool) compiles layout file resources into a more compact format
        * When **setContentView(...)** is called in the **onCreate(Bundle)** Method, the Activity uses the **LayoutInflater** class to instantiate each of the View objects as defined in the layout file
    * Wiring up widgets
        * get *references* to the inflated View objects
        * set *listeners* on those objects to respond to user actions
  
* Android Build Process
    * The Android tools take *resources*, *codes*, and *AndroidManifest.xml* file
        * AndroidManifest.xml contains metadata about the application
    * And turn them into an *.apk file*
  
#### 참고 자료

> [Activity 관련 자료](https://developer.android.com/guide/components/activities/index.html)  
> [UI 관련 자료](https://developer.android.com/guide/topics/ui/index.html)  
> [Resource 관련 자료](https://developer.android.com/guide/topics/resources/index.html)  
> [Toast 관련 자료](https://developer.android.com/guide/topics/ui/notifiers/toasts.html)  
> [Context 관련 자료](https://developer.android.com/reference/android/content/Context.html)  
> [App Manifest 관련 자료](https://developer.android.com/guide/topics/manifest/manifest-intro.html)  

--------------------------------------------------------

### Ch02 Android and Model-View-Controller

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

--------------------------------------------------------

### Ch03 The Activity Lifecycle

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

--------------------------------------------------------

### Ch04 Debugging Android Apps

* Exceptions and Stack Traces
    * Diagnosing misbehaviors
    * Logging stack traces
    * Setting breakpoints
    * Using exception breakpoints
* Android-Specific Debugging
    * Using Android Lint
        * Issues with the R class

--------------------------------------------------------

### Ch05 Your Second Activity

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

--------------------------------------------------------

### Ch06 Android SDK Versions and Compatibility

* Android SDK Versions
    * Compatibility and Android Programming
        * A sane Minimum
        * Minimum SDK version
        * Target SDK version
        * Compile SDK version
        * Adding code from layer APIs safely
* Using the Android Developer Documentation