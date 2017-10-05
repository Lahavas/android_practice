예제 프로젝트 2. CriminalIntent
----------------------------

CriminalIntent는 'Office Crimes'를 기록하기 위한 프로젝트입니다.  

#### 도전 과제

* [ ] RecyclerView ViewTypes

--------------------------------------------------------

### Ch07 UI Fragments and the Fragment Manager

* The Need for UI Flexibility
* Introducing Fragments
* Starting CriminalIntent
    * Creating a new project
    * Two types of fragments
    * Adding dependencies in Android Studio
    * Creating the Crime class
* Hosting a UI Fragment
    * The fragment lifecycle
    * Two approaches to hosting
    * Defining a container view
* Creating a UI Fragment
    * Defining CrimeFragment's layout
    * Creating the CrimeFragment class
        * Implementing fragment lifecycle methods
        * Wiring widgets in a fragment
* Adding a UI Fragment to the FragmentManager
    * Fragment transactions
    * The FragmentManager and the fragment lifecycle
* Application Architecture with Fragments
    * The reason all our activities will use fragments
* For the More Curious: Fragments and the Support Library
* For the More Curious: Why Support Fragments Are Superior

#### 주요 개념

* **Fragment**
    * A controller object that the activity can deputize to perform tasks
    * UI Fragment
        * *UI Flexibility*
            * The ability to compose and recompose an activity's view at runtime
    * Hosting a UI Fragment
        * add the fragment
            * to the activity's layout
                * *layout fragment*
            * **in the activity's code**
  
* **FragmentManager**
    * Managing your fragments
    * Adding their views to the activity's view hierarchy
    * Handling two things
        * A list of fragments
        * A back stack of **fragment transactions**
    * When an activity is destroyed
        * **FragmentManager** saves out its list of fragments
  
* **Fragment Transaction**
    * To add, remove, attach, detach, or replace fragments in the fragment list
    * **add(...)**
        * A container view ID
        * the newly created Fragment
  
* Fragment Lifecycle
    * Fragment lifecycle methods are called by the hosting activity
        * Fragment lifecycle methods must be *public*
    * Called when you add the fragment to the **FragmentManager**
        * **onAttach(Context)**
        * **onCreate(Bundle)**
            * has a **Bundle**
                * **onSaveInstanceState(Bundle)**
            * Configure the fragment instance
        * **onCreateView(...)**
            * Inflate the layout for the fragment's view
                * LayoutInflater
                    * **LayoutInflater.inflate(...)**
                        * Passing in the layout's resource ID
                * ViewGroup
                    * Need to configure the widgets properly
            * Return the inflated View to the *hosting activity*
            * The place to *wiring up some widgets*
    * Called after the hosting activity's **onCreate(Bundle)** method has executed
        * **onActivityCreated(Bundle)**
  
* Maven
    * Dependency Management Tool
    * groupId:artifactId:version
  
#### 참고 자료

> [UI Flexibility 관련 자료](https://developer.android.com/training/basics/fragments/fragment-ui.html)  
> [Fragment 관련 자료](https://developer.android.com/guide/components/fragments.html)  
> [AppCompat Library 관련 자료](https://developer.android.com/topic/libraries/support-library/packages.html#v7-appcompat)  
> [App Build Dependencies 관련 자료](https://developer.android.com/studio/build/dependencies.html)  
> [UUID 관련 자료](https://developer.android.com/reference/java/util/UUID.html)  
> [Date 관련 자료](https://developer.android.com/reference/java/util/Date.html)  
> [Style 관련 자료](https://developer.android.com/guide/topics/ui/themes.html?)  
> [TextWatcher 관련 자료](https://developer.android.com/reference/android/text/TextWatcher.html)  
> [Checkbox 관련 자료](https://developer.android.com/reference/android/widget/CheckBox.html)  
> [Fluent Interface 관련 자료](https://en.wikipedia.org/wiki/Fluent_interface)  

--------------------------------------------------------

### Ch08 Displaying Lists with RecyclerView

* Updating CriminalIntent's Model Layer
    * Singletons and centralized data storage
* An Abstract Activity for Hosting a Fragment
    * A generic fragment-hosting layout
    * An abstract Activity class
        * Using an abstract class
        * Creating the new controllers
        * Declaring CrimeListActivity
* RecyclerView, Adapter, and ViewHolder
    * ViewHolders and Adapters
        * Adapters
    * Using a RecyclerView
    * A view to display
* Binding List Items
* Responding to Presses
* For the More Curious: ListView and GridView
* For the More Curious: Singletons

#### 주요 개념

* Singleton
    * A class that allows only one instance of itself to be created
    * A singleton exists as long as the application stays in memory
  
#### 참고 자료

> [Context 관련 자료](https://developer.android.com/reference/android/content/Context.html)  
>    

--------------------------------------------------------