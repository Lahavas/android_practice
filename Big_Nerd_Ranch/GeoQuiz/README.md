예제 프로젝트 1. GeoQuiz
---------------------

GeoQuiz는 지역에 대한 퀴즈 게임 프로젝트입니다.  
해당 프로젝트에서는 다음과 같은 개념들을 학습합니다.

* The fundamentals of Android project
* Activity and Layout
* Explicit Intent

#### 도전 과제

[ ] Customizing the Toast  
[ ] Add a Listener to the TextView  
[ ] Add a Previous Button  
[ ] From Button to ImageButton  
[ ] Preventing Repeat Answers  
[ ] Graded Quiz  
[ ] Exploring the Layout Inspector  
[ ] Exploring Allocation Tracking  
[ ] Closing Loopholes for Cheaters  
[ ] Reporting the Build Version  
[ ] Limited Cheats  

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

#### 주요 개념

* **onCreate(Bundle)**
    * **setContentView(int)**
        * Inflating widgets and putting them on screen
    * Getting references to inflated widgets
    * Setting listeners on widgets to handle user interaction
    * Connecting to external model data
  
* **Device Configuration**
    * A set of characteristics that describe the *current state* of an individual device
        * Screen orientation, Screen density, Screen size, Keyboard type, Dock mode, Language, and more
    * **Runtime Configuration Change**
        * onPause() -> onStop() -> **onDestroy()** -> onCreate(Bundle) -> onStart() -> onResume()
    * Configuration Qualifier
        * Configuration qualifiers on *res* subdirectories are how Android identifies which resources best match the current device configuration
    * **onSaveInstanceState(Bundle)**
        * This method is called before onStop()
        * **Bundle** object
            * a structure that maps string keys to values of certain limited types
  
#### 참고 자료

> [Activity Lifecycle 관련 자료](https://developer.android.com/guide/components/activities/activity-lifecycle.html)  
> [Handling Configuration Changes 관련 자료](https://developer.android.com/guide/topics/resources/runtime-changes.html)  
> [Configuration Qualifier 관련 자료](https://developer.android.com/guide/topics/resources/providing-resources.html)  
> [Bundle 관련 자료](https://developer.android.com/guide/components/activities/parcelables-and-bundles.html)  
> [Log 관련 자료](https://developer.android.com/reference/android/util/Log.html)  

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

#### 주요 개념

* manifest
    * An XML file containing *metadata* that describes your application to the Android OS
  
* **Intent**
    * An object that a *component* can use to communicate with the OS
    * *public Intent(Context packageContext, Class<?> cls)*
        * **Class**
            * The activity class that the ActivityManager should start
        * **Context**
            * Application package the activity class can be find in
    * **Explicit Intent**
        * To start *activities* within your application
    * **Implicit Intent**
        * To start an activities in *another application*
    * **Extra**
        * Extras are *arbitary data* that the calling activity can include with an intent
            * key-value pair
        * **Intent.putExtra(...)**
        * **Activity.getIntent(...)**
  
* **startActivity(Intent)**
    * When an activity calls this method, this call is sent to the part of OS called by **ActivityManager**
        * The ActivityManager creates the **Activity** instance
        * This calls its **onCreate(Bundle)** method
    * Before starting the activity
        * The ActivityManager checks the package’s manifest for a declaration with the same name as the specified Class
            * *ActivityNotFoundException*
  
* **startActivityForResult(Intent, int)**
    * *requestCode*
    * *resultCode*
        * **Activity.setResult(int, Intent)**
  
* How Android Sees Your Activities
    * OS starts the application's *launcher activity*
    * Launcher Activity Status
        * the manifest by the *intent-filter* element
        * in a **Back Stack**
            * the ActivityManager maintains a *back stack*
            * Activities for all applications share the back stack
  
#### 참고 자료

> [App Manifest 관련 자료](https://developer.android.com/guide/topics/manifest/manifest-intro.html)  
> [Navigating Between Activities 관련 자료](https://developer.android.com/guide/components/activities/activity-lifecycle.html)  
> [Intent 관련 자료](https://developer.android.com/guide/components/intents-filters.html)  
  
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

#### 주요 개념

* *build.gradle* file
    * compileSdkVersion
        * not used to update the AndroidManifest.xml file
    * minSdkVersion
    * targetSdkVersion
  
#### 참고 자료

> [Android Build Version 관련 자료](https://developer.android.com/reference/android/os/Build.VERSION.html)  
> [Animation 관련 자료](https://developer.android.com/guide/topics/graphics/overview.html)  