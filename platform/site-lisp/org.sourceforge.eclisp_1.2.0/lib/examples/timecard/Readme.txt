


Contents:

* What is this?
* How to make it work?
* What are all the files:
* How to use the application?

----------------------------------------------------------------------

* What is this?

     The files in this directory define a simple timekeeping application.
     The Lisp code keeps track of start and stop times for various projects
     and calls Java AWT methods to show a simple spreadsheet interface to
     the user.


* How to make it work?

     - Copy this entire directory to a convenient place
     - cd to the copy
     - start acl in the copied folder
     - top-level command:   :cl main.cl
     - evaluate expression: (main)
     - After some progress messages, a window will appear with menus
        buttons and pull-down lists.
     - to view a timesheet filled in with many days of data,
       select menus File -> Open...
       and pick the file timestmp.316.


* What are all the files:

     Readme.txt       - this file

     main.cl          - the program source
                        There are comments in the file describing various ways
                        to start and run this application.

     timecode.cl      - a sample project definition file

     timenick.cl      - a sample project nickname file

     timestmp.ini     - a sample configuration file

     timestmp.316     - a timesheet prefilled with many days

     ljrun.cl         - a sample startup file
     



* How to use the application?

  Main Window:

     Menus:

       File
         Open,,,             - Open a file selection dialog.  If a new timestamp
                               file is selected, close the current window and 
                               open a new window on the selected file.
         ReloadDefault-File  - Revert to the current default file.
         DontAutoSave        - Turn off AutoSave mode - changes in the window
                               must be saved explicitly.
         SaveTimestamps      - Save the contents of the window in a file.
         ResumeAutoSave      - Resume AutoSave mode - data is saved to file
                               after every change.
         ShowSummary         - Open a summary window that shows totals by day
                               and by project.
         PrintTimeCard       - Create a test file timecard.txt with formatted
                               time and project data.
         Print&Exit          - Create a text file and exit the application.
         Exit                - Exit the application.

       Edit
         ReplaceTimeCode     - Set the selected time slots to the current project.
                               If there is no selection, do nothing.
         Replace&Step        - Set the selected time slots to the current project
                               and select the next time slot.
                               If there is no selection, select the time slot following
                               the first time slot of the day.
         Set to None         - Clear out the project setting of the selected time slots.
         None&Step           - Clear and step.
         Drop Code           - Remove the current project from the Left project list.
         
       Select
         Today           - Select the page for the current calendar day.
         Now             - Select the time slot that contains the current real time.
         Next Day        - Select the page for the day following the currently 
                           selected day.
         Previous Day    - Select the page for the day preceding the currently 
                           selected day.
         Next Hour       - Select the hour following the currently selected hour.
         Next Min        - Select the time slot following the currently selected slot.
         Previous Min    - Select the time slot preceding the currently selected slot.
         Previous Hour   - Select the hour preceding the currently selected hour.
         Full Hour       - Select all the time slots in the currently selected hour.
         Deselect        - Deselect any selected time slots.

       LongTimer
         15 minutes - set the initial timer value to 15 minutes in the Small Window
         30 minutes - set the initial timer value to 30 minutes
         45 minutes - set the initial timer value to 45 minutes 
         60 minutes - set the initial timer value to 60 minutes

       ShortTimer
         5 Minutes - set the warning interval to 5 minutes in the Small Window
         4 Minutes - set the warning interval to 4 minutes in the Small Window
         3 Minutes - set the warning interval to 3 minutes in the Small Window
         10 Minutes - set the warning interval to 10 minutes in the Small Window

     Status Indicator:
          AutoSaveMode
          ManSave
          Unsaved

     Pull Down List:

        Left: A short list of projects recently selected from the full list.
               The current default project is moved to the top of the list.

        Right: The full list of project names.
               Selecting a project copies it to the Left list and makes it the
               current default project.
       
     Buttons:
	  
       ToSmall - Switch to the Small Window form.

       NOW     - Select the time slot that includes the current real time.

       Day Buttons - Select the page for the corresponding day.

       Time slots - Left-click to select a time slot.
                    Double-click to select the slot and set to the current project.
  

  Small Window:

     The left pane shows the current project name.
     Right-click on this pane opens a pop-up menu of current projects.
     When a new project is selected, the right pane reverts to
     to the current LongTimer value.
     Double-click on this pane resets the right pane to the current
     LongTimer value.
     
     The right pane shows the time remaining since a new project was
     selected.  When the time remaining reaches the ShortTimer value,
     the window will change to red and beep.  When the time runs out,
     The current project changes to None and the timer stops.  Thus,
     to stay in the current project, double-click on the left pane.

     Closing the Small Window restores the Main Window.

-------------------------------------------------------------------------------
SIDEBAR: What if jlinker fails to start?

The most common cause for this failure is that Lisp fails to start the
Java virtual machine.  The distributed jlinker code assumes that Java
has been installed in some commonly seen locations; on Windows we
look in the Windows Registry; on Unix-like systems we look in several
likely directories.

If the default search fails, then it may be necessary to set the
variable net.jlinker:*jlinker-java-home*.  The sample file
jlinker/jl-config.cl includes comments describing various ways to set
this variable.

The timecard code also assumes that the Java library jlinker.jar is
found in the ACL installation directory.  If for some reason that is
not the case, the source in main.cl may need to be modified: in the
two calls to jlinker-init, add the :jar argument with the value a
string containing the pathname of this file.

-------------------------------------------------------------------------------
SIDEBAR: What does it mean "start ACL in folder foo"?

How to "start ACL in folder foo"?

The goal of this step is to have ACL running with the current default
folder (directory )in ACL being the folder (directory) foo.  This kind
of operation is useful because after this step, files in folder foo
can be manipulated without any folder (directory) prefixes that make
examples long and hard to read.



Windows:

There are several ways to reach this goal:

 1. Select one of the ACL executables from the Start Menu
    AND THEN, in the Lisp console window or the Lisp debug
    window, enter the command

          :cd full-path-to-folder

 2. Open a DOS Command Prompt Window and then enter the commands

          cd full-path-to-folder
          full-path-to-ACL-executable

 3. Create a shortcut to ACL in the working folder (foo) and
    make sure that the "Start in" line on the shortcut Properties
    window is blank.

    Double-click on the shortcut.

 4. Create a shortcut to ACL in some convenient place, and
    make sure that the "Start in" line on the shortcut Properties
    window points to the folder foo.

    Double-click on the shortcut.


Unix:

 1. Select one of the ACL executables and start it from a
    command shell,  AND THEN, at the Lisp console prompt,
    enter the command

          :cd full-path-to-folder

 2. In a suitable shell window or buffer, enter the commands

          cd full-path-to-folder
          full-path-to-ACL-executable

-------------------------------------------------------------------------------


