예제 프로젝트 2. CriminalIntent
----------------------------

CriminalIntent는 'Office Crimes'를 기록하기 위한 프로젝트입니다.  

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
    * Fragment Lifecycle
        * Fragment lifecycle methods are called by the hosting activity
    * Hosting a UI Fragment
        * add the fragment
            * to the activity's layout
                * *layout fragment*
            * **in the activity's code**
  
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
> 
  
--------------------------------------------------------