Android API Guide
=================

공식 개발 문서의 API Guide 정리 내용입니다.
-----------------------------------  

* Introduction
    * App Fundamentals
    * Device Compatibility
    * System Permissions
        * Requesting Permissions
        * Defining Permissions
* Platform Architecture
    * Use Java 8 Language Features
    * Verifying App Behavior on the Android Runtime (ART)
* App Components
    * Intents and Intent Filters
        * Common Intents
    * Activities
        * Introduction to Activities
        * The Activity Lifecycle
        * Activity State Changes
        * Tasks and Back Stack
        * Processes and Application Lifecycle
        * Parcelables and Bundles
        * Recents Screen
    * Fragments
    * Loaders
    * Services
        * Bound Services
        * AIDL
    * Content Providers
        * Content Provider Basics
        * Creating a Content Provider
        * Calendar Provider
        * Contacts Provider
        * Open files using Storage Access Framework
        * Create a Custom Document Provider
    * Broadcasts
    * App Widgets
        * App Widget Host
    * Processes and Threads
* App Resources
    * Overview
    * Providing Resources
    * Accessing Resources
    * Handling Runtime Changes
    * Localization
        * Test Your App with Pseudolocales
        * ICU4J Android Framework APIs
        * Language and Locale
    * Complex XML Resources
    * Resource Types
        * Animation
        * Color State List
        * Drawable
        * Layout
        * Menu
        * String
        * Style
        * More Types
* App Manifest
    * \<action>
    * \<activity>
    * \<activity-alias>
    * \<application>
    * \<category>
    * \<compatiblie-screens>
    * \<data>
    * \<grant-uri-permission>
    * \<instrumentation>
    * \<intent-filter>
    * \<manifest>
    * \<meta-data>
    * \<path-permission>
    * \<permission>
    * \<permission-group>
    * \<permission-tree>
    * \<provider>
    * \<receiver>
    * \<service>
    * \<supports-gl-texture>
    * \<supports-screens>
    * \<uses-configuration>
    * \<uses-feature>
    * \<uses-library>
    * \<uses-permission>
    * \<uses-permission-sdk-23>
    * \<uses-sdk>
* User Interface
    * Overview
    * Layouts
        * Linear Layout
        * Relative Layout
        * Recycler View
        * List View
        * Grid View
    * Look and Feel
        * Downloadable Fonts
        * Fonts in XML
        * Emoji Compatibility
        * Autosizing TextView
        * Styles and Themes
    * Input Controls
        * Buttons
        * Checkboxs
        * Radio Buttons
        * Toggle Buttons
        * Spinners
        * Pickers
    * Input Events
    * Menus
    * Settings
    * Dialogs
    * Notifications
    * Toasts
    * Tooltips
    * Adaptive Icons
    * App Shortcuts
    * Search
        * Creating a Search Interface
        * Adding Recent Query Suggestions
        * Adding Custom Suggestions
        * Searchable Configuration
    * Multi-Window Support
    * Drag and Drop
    * Accessibility
        * Making Apps More Accessible
        * Using Node Tree Debugging
        * Building Accessibility Services
        * Building Accessible Custom Views
    * Styles and Themes
    * Custom Components
* Animation and Graphics
    * Overview
    * Property Animation
    * View Animation
    * Drawable Animation
    * Canvas and Drawables
        * Vector Drawable
    * Physics-based Animations
        * Spring Animation
        * Fling Animation
    * OpenGL ES
    * Hardware Acceleration
* Computation
    * RenderScript
    * Advanced RenderScript
    * Runtime API Reference
        * Numerical Types
        * Object Types
        * Conversion Functions
        * Mathematical Constants and Functions
        * Vector Math Functions
        * Matrix Functions
        * Quaternion Functions
        * Atomic Update Functions
        * Time Functions and Types
        * Allocation Data Access Functions
        * Object Characteristics Functions
        * Kernel Invocation Functions and Types
        * Input/Output Functions
        * Debugging Functions
        * Graphics Functions and Types
        * Index
* Media Apps
    * Media Apps Overview
    * Working with a Media Session
    * Building an Audio App
        * Building a Media Browser Service
        * Building a Media Browser Client
        * Media Session Callbacks
    * Building a Video App
        * Building a Video Player Activity
        * Media Session Callbacks
    * Responding to Media Buttons
    * Handling Changes in Audio Output
    * Managing Audio Focus
    * Interacting with Google Assistant
* Media and Camera
    * Supported Media Formats
    * MediaPlayer
    * MediaRecoder
    * ExoPlayer
    * Controller Amplitude with VolumeShaper
    * Media Routing
        * MediaRouter API
        * MediaRouteProvider API
    * Camera API
* Location and Sensors
    * Location and Maps
    * Location Strategies
    * Sensors Overview
    * Motion Sensors
    * Position Sensors
    * Environment Sensers
    * Raw GNSS Measurements
* Connectivity
    * Bluetooth
        * Bluetooth Low Energy
    * NFC
        * NFC Basics
        * Advanced NFC
        * Host-based Card Emulation
    * Telecom
        * Self-Managed ConnectionServices
    * Wi-Fi P2P
    * Wi-Fi Aware
    * Companion Device Pairing
    * USB
        * Accessory
        * Host
    * SIP
* Text and Input
    * Autofill Framework
    * Copy and Paste
    * Creating an IME
        * Image Keyboard
    * Spelling Checker
* Data Storage
    * Storage Options
    * Data Backup
        * Account Transfer API
        * Auto Backup
        * Key/Value Backup
        * Testing Backup and Restore
    * App Install Location
* Administration
    * Device Policies
* Web Apps
    * Supporting Different Screens in Web Apps
    * Building Web Apps in WebView
    * Managing WebViews
    * Migrating to WebView in Android 4.4
    * Debugging Web Apps
    * Best Practices for Web Apps
* Best Practices
    * Supporting Multiple Screens
        * Distributing to Specific Screens
        * Screen Compatibility Mode
    * Designing for Seamlessness
    * Supporting Tablets and Handsets