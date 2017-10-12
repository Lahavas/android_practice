예제 프로젝트 2. CriminalIntent
----------------------------

CriminalIntent는 'Office Crimes'를 기록하기 위한 프로젝트입니다.  

#### 도전 과제

* [ ] RecyclerView ViewTypes
* [ ] Formatting the Date
* [ ] Efficient RecyclerView Reloading
* [ ] Improving CrimeLab Performance
* [ ] Restoring CrimeFragment's Margins
* [ ] Adding First and Last Buuttons
* [ ] More Dialogs
* [ ] A Responsive DialogFragment
* [ ] Deleting Crimes
* [ ] Plural String Resources
* [ ] An Empty View for the RecyclerView
* [ ] Deleting Crimes
* [ ] ShareCompat
* [ ] Another Implicit Intent
* [ ] Detail Display
* [ ] Efficient Thumbnail Load

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
  
* **List<E>**
    * An interface that supports an ordered list of objects of a given type
  
* **RecyclerView**
    * A subview of ViewGroup
    * Displaying a list of child View objects
    * **ViewHolder**
        * It holds on to a **View**
        * *itemView*
            * It holds a reference to the entire View you passed into **super(view)**
    * **Adapter**
        * A controller object that sits between the **RecyclerView** and *the data set* that the RecyclerView should display
            * Creating the necessary **ViewHolder**s
            * binding **ViewHolder**s to data from the model layer
  
* RecyclerView-Adapter conversation
    * **getItemCount()**
        * The RecyclerView asks how many objects are in the list
    * **onCreateViewHolder(ViewGroup, int)**
        * To create a new ViewHolder
    * **onBindViewHolder(ViewHolder, int)**
        * The adapter will look up the model data for that position
        * and *bind* it to the ViewHolder's View
    * Once enough ViewHolders have been created, RecyclerView stops calling **onCreateViewHolder(...)**
  
#### 참고 자료

> [Context 관련 자료](https://developer.android.com/reference/android/content/Context.html)  
> [RecyclerView 관련 자료](https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html)  
> [RecyclerView Practice 관련 자료](https://developer.android.com/training/material/lists-cards.html)  
> [LayoutManager 관련 자료](https://developer.android.com/reference/android/support/v7/widget/RecyclerView.LayoutManager.html)  
> [ViewHolder Design Pattern 관련 자료](https://developer.android.com/training/improving-layouts/smooth-scrolling.html#ViewHolder)  

--------------------------------------------------------

### Ch09 Creating User Interfaces with Layouts and Widgets

* Using the Graphical Layout Tool
* Introducing ConstraintLayout
    * Using ConstraintLayout
    * The graphical editor
    * Making room
    * Adding widgets
    * ConstraintLayout's inner workings
    * Editing properties
    * Making list items dynamic
* More on Layout Attributes
    * Screen pixel densities and dp and sp
    * Margins vs padding
    * Styles, themes, and theme attributes
    * Android's design guidelines
* The Graphical Layout Tools and You

#### 주요 개념

* **ConstraintLayout**
    * View Size Setting
        * Fixed
            * Xdp
        * Wrap Content
            * wrap_content
        * Any Size
            * 0dp
    * **Constraint Handle**
  
* **Layout Attribute**
    * *density-independent dimension unit*
        * px (pixel)
        * **dp** (density-independent pixel)
            * One dp is always 1/160th of an inch on a device's screen
            * When your display is a higher density, dp will expand to fill a larger number of screen pixels
        * **sp** (scale-independent pixel)
            * sp is dp that also take into account the user's font size preference
            * You will **almost always use sp** to set display text size
        * pt, mn, in
            * pt (point) : 1/72 of an inch
            * mn (millimeters)
            * in (inches)
    * **Margin**
        * *Layout Parameter*
            * They determine *the distance between widgets*
    * **Padding**
        * Telling the widget *how much bigger than its contents* it should draw itself
    * **Style**
        * An XML resource that contains attributes that describe how a widget should look and behave
        * in *res/values/*
        * *@style/my_own_style*
    * **Theme**
        * A collection of styles
        * *theme attribute reference*
            * You tell Android's runtime resource manager
                * "Go to the app's theme and find the attribute named '...'"
  
#### 참고 자료

> [Graphical Layout Tool 관련 자료](https://developer.android.com/studio/write/layout-editor.html)  
> [ConstraintLayout 관련 자료](https://developer.android.com/reference/android/support/constraint/ConstraintLayout.html)  
> [ConstraintLayout Practice 관련 자료](https://developer.android.com/training/constraint-layout/index.html)  
> [Layout 관련 자료](https://developer.android.com/guide/topics/ui/declaring-layout.html)  
> [Multiple Screen 관련 자료](https://developer.android.com/guide/practices/screens_support.html)  
> [Density-Independent Pixel 관련 자료](https://developer.android.com/training/multiscreen/screendensities.html)  
> [Style and Theme 관련 자료](https://developer.android.com/guide/topics/ui/look-and-feel/themes.html)  
> [Android's Material Design Guideline](https://developer.android.com/design/index.html)  

--------------------------------------------------------

### Ch10 Using Fragment Arguments

* Starting an Activity from a Fragment
    * Putting an extra
    * Retrieving an extra
    * Updating CrimeFragment's view with Crime data
    * The downside to direct retrieval
* Fragment Arguments
    * Attaching arguments to a fragment
    * Retrieving arguments
* Reloading the List
* Getting Results with Fragments
* For the More Curious: Why Use Fragment Arguments?

#### 주요 개념

* Two ways a fragment can access data in its activity's intent
    * Direct retrieval
        * use **getActivity()**
        * Fragment is no longer a reusable building block
            * It will *always be hosted* by an activity
    * **Fragment Arguments**
        * Every fragment instance can have a **Bundle** object attached to it
            * *Argument Bundle*
                * key-value pairs
                * Each pair is known as an *argument*
  
* **newInstance()**
    * To Create the fragment instance
    * To Bundle up and set its arguments
  
* Getting results with fragments
    * Only activities have results
        * While Fragment has its own **startActivityForResult(...)** and **onActivityResult(...)** methods
        * It does not have any **setResult(...)** methods
    * In Fragment, *getActivity().setResult(Activity.RESULT_OK, null);*

#### 참고 자료

> [Fragment 관련 자료](https://developer.android.com/guide/components/fragments.html)  

--------------------------------------------------------

### Ch11 Using ViewPager

* Creating CrimePagerActivity
    * ViewPager and PagerAdapter
    * Integrating CrimePagerActivity
* FragmentStatePagerAdapter vs FragmentPagerAdapter
* For the More Curious: How ViewPager Really Works
* For the More Curious: Laying Out Views in Code

#### 주요 개념

* **ViewPager**
    * To your UI lets users navigate between list items by swiping across the screen to "page" forward or backward
    * **PagerAdapter**
        * **FragmentStatePagerAdapter**
            * Unneeded fragment is destroyed
                * A transaction is committed to remove the fragment from your activity's FragmentManager
                    * **remove(Fragment)**
            * **getCount()**
            * **getItem(int)**
        * **FragmentPagerAdapter**
            * When your fragment is no longer needed, FragmentPagerAdapter calls **detach(Fragment)** on the transaction
  
* To implement the raw **PagerAdapter** interface
    * To host normal **View** objects in a ViewPager
    * **PagerAdapter.instantiateItem(ViewGroup, int)**
        * To create an item view for a given position
        * To add it to a container ViewGroup
    * **PagerAdapter.destroyItem(ViewGroup, int, Object)**
        * To destroy that item
    * **PagerAdapter.isViewFromObject(View, Object)**
        * To figure out which item's view it is
        * The Object parameter is an object received from a call to **instantiateItem(...)**
  
#### 참고 자료

> [ViewPager 관련 자료](https://developer.android.com/reference/android/support/v4/view/ViewPager.html)  
> [ViewPager Practice 관련 자료](https://developer.android.com/training/animation/screen-slide.html)  
> [PagerAdapter 관련 자료](https://developer.android.com/reference/android/support/v4/view/PagerAdapter.html)  

--------------------------------------------------------

### Ch12 Dialogs

* Creating a DialogFragment
    * Showing a DialogFragment
    * Setting a dialog's contents
* Passing Data Between Two Fragments
    * Passing data to DatePickerFragment
    * Returning data to CrimeFragment

#### 주요 개념

* **DialogFragment**
    * for using an **AlertDialog**
        * **AlertDialog.Builder** class
    * Showing a DialogFragment
        * Using a **FragmentManager**
            * A transaction will automatically be created and committed
            * **show(FragmentManager, String)**
        * Using a **FragmentTransaction**
            * For creating and committing that transaction
            * **show(FragmentTransaction, String)**
  
* Passing Data Between Two Fragments that are hosted by the same activity
    * use *newInstance()* and *target fragment*
        * **setTargetFragment(Fragment, int)**
            * This method accepts the fragment that will be the target and a request code just like one you send in **startActivityForResult(...)**
        * **Fragment.onActivityResult(...)**
            * After the activity has received the call, the activity's **FragmentManager** then calls this method on the appropriate fragment
            * When dealing with two fragments hosted by the same activity, you can borrow this method
    * Other solution... see later chapter
  
#### 참고 자료

> [Dialogs 관련 자료](https://developer.android.com/guide/topics/ui/dialogs.html)  
> [Calendar 관련 자료](https://developer.android.com/reference/java/util/Calendar.html)  

--------------------------------------------------------

### Ch13 The Toolbar

* AppCompat
    * Using the AppCompat library
* Menus
    * Defining a menu in XML
    * Creating the menu
    * Responding to menu selections
* Enabling Hierarchical Navigation
    * How hierarchical navigation works
* An Alternative Action Item
    * Toggling the action item title
    * "Just one more thing..."
* For the More Curious: Action Bar vs Toolbar

#### 주요 개념

* **AppCompat Library**
    * AppCompat's themes
        * Theme.AppCompat
        * Theme.AppCompat.Light
        * Theme.AppCompat.Light.DarkActionBar
    * AppCompatActivity
  
* **ToolBar**
    * **Menu**
        * *action item* (or *menu item*)
            * To perform an action on the current screen or on the app as a whole
        * *showAsAction* property
            * refers to thether the item will appear in the toolbar itself or in the *overflow menu*
        * **onCreateOptionMenu(Menu, MenuInflater)**
            * The **FragmentManager** is responsible for calling **Fragment.onCreateOptionsMenu(Menu, MenuInflater)**
                * When the activity receives its **onCreateOptionsMenu(..)** callback from the OS
        * **onOptionsItemSelected(MenuItem)**
  
* Navigation
    * *temporal navigation*
        * Using the Back button
        * It takes you to where you were *last*
    * *hierarchical navigation* (or *ancestral navigation*)
        * Using the Up button
        * It takes you up the *app hierarchy*
  
#### 참고 자료

> [ToolBar 관련 자료](https://developer.android.com/reference/android/support/v7/widget/Toolbar.html)  
> [App Bar Practice 관련 자료](https://developer.android.com/training/appbar/setting-up.html)  
> [AppCompat Library 관련 자료](https://developer.android.com/topic/libraries/support-library/packages.html)  
> [Menus 관련 자료](https://developer.android.com/guide/topics/ui/menus.html)  
> [Iconography 관련 자료](https://material.io/guidelines/style/icons.html)  
> [Image Asset Studio 관련 자료](https://developer.android.com/studio/write/image-asset-studio.html)  
> [Navigation with Back and Up 관련 자료](https://developer.android.com/design/patterns/navigation.html)  
> [Back Stack 관련 자료](https://developer.android.com/guide/components/activities/tasks-and-back-stack.html)  

--------------------------------------------------------

### Ch14 SQLite Databases

* Defining a Schema
* Building your Initial Database
    * Exploring files using Android Device Monitor
    * Debugging database issues
* Gutting CrimeLab
* Writing to the Database
    * Using ContentValues
    * Inserting and updating rows
* Reading from the Database
    * Using a CursorWrapper
    * Converting to model objects
        * Refreshing model data
* For the More Curious: More Databases
* For the More Curious: The Application Context

#### 주요 개념

* apploication's sandbox
    * a child of the device's */data/data* directory named after the application package
  
* **SQLiteOpenHelper** class
    * A class designed to get rid of the grunt work of opening a **SQLiteDatabase**
  
* **ContentValues**
    * A key-value store class
    * Designed to store the kinds of data SQLite can hold
  
* **CursorWrapper**
    * To wrap a **Cursor** you received
  
* **The Application Context**
    * If any of your activities exist, Android will have also created an *application* object
        * It has a much longer lifetime than any one activity
  
#### 참고 자료

> [SQLite Practice 관련 자료](https://developer.android.com/training/basics/data-storage/databases.html)  
> [SQLiteOpenHelper 관련 자료](https://developer.android.com/reference/android/database/sqlite/SQLiteOpenHelper.html)  
> [ContentValues 관련 자료](https://developer.android.com/reference/android/content/ContentValues.html)  
> [Cursor 관련 자료](https://developer.android.com/reference/android/database/Cursor.html)  
> [CursorWrapper 관련 자료](https://developer.android.com/reference/android/database/CursorWrapper.html)  
> [Context 관련 자료](https://developer.android.com/reference/android/content/Context.html)  

--------------------------------------------------------

### Ch15 Implicit Intents

* Adding Buttons
* Adding a Suspect to the Model Layer
* Using a Format String
* Using Implicit Intents
    * Parts of an implicit intent
    * Sending a crime report
    * Asking Android for a contact
        * Getting the data from the contact list
        * Contacts permissions
    * Checking for responding activities

#### 주요 개념

* Intent
    * an object that describes to the OS something that you want it to do
    * *explicit intent*
        * the activity that you want the OS to start
    * *implicit intent*
        * the job that you want done
            * the *action* that you are trying to perform
                * To describe *what* to do
                    * Intent.ACTION_VIEW
            * the location of any *data*
                * the URL of a web page
                * a URI to a file
                * a *content URI* pointing to a record in a **ContentProvider**
            * the *type* of data that the action is for
                * a MIME type
            * optional *categories*
                * To describe *where*, *when*, or *how* you are trying to use an activity
                    * android.intent.category.LAUNCHER
  
* PackageManager
    * It knows about all the components installed on Android device, including all of its activities
    * **resolveActivity(Intent, int)**
        * To find an activity that matches the Intent you gave it
        * It will return an instance of **ResolveInfo**
  
#### 참고 자료

> [Implicit Intent 관련 자료](https://developer.android.com/guide/components/intents-common.html)  
> [Implicit Intent Practice 관련 자료](https://developer.android.com/training/basics/intents/sending.html)  
> [String Resource 관련 자료](https://developer.android.com/guide/topics/resources/string-resource.html)  
> [Formatter 관련 자료](https://developer.android.com/reference/java/util/Formatter.html)  
> [Android DateFormat 관련 자료](https://developer.android.com/reference/android/text/format/DateFormat.html)  
> [Content Provider 관련 자료](https://developer.android.com/guide/topics/providers/content-providers.html)  
> [Contacts Provider 관련 자료](https://developer.android.com/guide/topics/providers/contacts-provider.html)  
> [PackageManager 관련 자료](https://developer.android.com/reference/android/content/pm/PackageManager.html)  

--------------------------------------------------------

### Ch16 Taking Pictures with Intents

* A place for Your Photo
* File Storage
    * Using FileProvider
    * Designating a picture location
* Using a Camera Intent
    * Firing the intent
* Scaling and Displaying Bitmaps
* Declaring Features

#### 주요 개념

* **ContentProvider**
    * To expose content URIs to other apps
  
* **MediaStore** class
    * The public interfaces used in Android for interacting with common media
  
#### 참고 자료

> [File 관련 자료](https://developer.android.com/reference/java/io/File.html)  
> [Files Practice 관련 자료](https://developer.android.com/training/basics/data-storage/files.html)  
> [Content Provider 관련 자료](https://developer.android.com/guide/topics/providers/content-providers.html)  
> [FileProvider 관련 자료](https://developer.android.com/reference/android/support/v4/content/FileProvider.html)  
> [MediaStore 관련 자료](https://developer.android.com/reference/android/provider/MediaStore.html)  
> [Bitmap 관련 자료](https://developer.android.com/reference/android/graphics/Bitmap.html)  
> [BitmapFactory 관련 자료](https://developer.android.com/reference/android/graphics/BitmapFactory.html)  
> [Managing Bitmap 관련 자료](https://developer.android.com/topic/performance/graphics/manage-memory.html)  
> [Declaring Feature 관련 자료](https://developer.android.com/guide/topics/manifest/uses-feature-element.html)  

--------------------------------------------------------