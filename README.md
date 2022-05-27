# Bike_Shop_Application_Frontend_Android
This is a front end application written in Kotlin that connects to a back end and retrieves data from there.


This is a simple Android application that consists of 2 fragments. These 2 fragments are brought together by a pager adapter named ViewPagerAdapter.
And this pager adapter is used in the main activity to put up the final application.
In the res folder there are the XML resources for this project. These are organised in folders like drawable, where all the icons that are to be drawn on the screen are located, along with tab selector XMLs. These latter ones combines 2 icons and having 2 different styles for the same icon, depending on the selected status of the element. The tab_icon_selector.xml brings the 4 aforementioned icons together (2 icons with 2 different styles each).
In the layout folder there are the main XML that are to be inflated for this application. There are the files for the 2 fragments of the application which momentarily only contain a TextView, but in the future they will contain cards with products and basic information about them.
Then, in the same layout folder there is activity_main.xml which is the the view that is first inflated in our application. This has an AppBarLayout with a TabLayout, where a tab is selected and the corresponding fragment is showed, from the 2 one mentioned above. These are going to be shown in a ViewPager, which is situated right below the AppBarLayout.
