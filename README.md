# plus500-ui
Simple Android UI for a Plus500 assignment

# Android Layouts Assignment

## General Requirments:
You are required to develop screen layouts in Android, with the following requirements in
consideration:
- Dynamic assets: The screen texts can be different
- Support different Screen sizes: screen will be used varied devices which differ in their
size
- Support portrait and landscape.
- Support different languages include RTL.
## Layout Quality measurments:
- Use a minimum set of layouts in term of multiple layouts per screen
  - I.e. prefer one responsive layout over using one for LTR and one for RTL
languages.
- Break a layout to logical pieces, using <include> and styles.
  - E.g. a line in a list should be one XML as it will be inflated multiple times with
different data.
- If you can implement a behavior with XML, prefer it over code.
  - E.g. use “android:text” in XML instead of view.setText method.
- Try to build the layout to be easily maintained as possible
  - E.g change margin of views that are aligned in one shot.
- Use Themes where you spot a similar design over the screens.
- Use the most fitted layout for the task, but use advanced layouts if you gain real value.
- E.g. if you can achieve a behavior with a simple linearLayout prefer it over
constraintLayout.
- Please add comments to explain your choices.
- Views on the screen should not be cut no in any circumstance.

Please submit a full android project, that includes an activity/fragment for each screen.
There is no need for any interaction in the screens, and there is no need to have the ability to
change between them with a click of a button.
Submit the layouts with the exact look of the required screens when running the app.

## Screens
![Screens](https://github.com/petrovprime/plus500-ui/blob/master/screenshots/screens.PNG "Screens")

# Installation

* Clone this git repo
* Import the project in Android Studio 3.4.1 or later
* Run
