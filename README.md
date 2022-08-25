CodePad From LC
========
This was forked from https://github.com/yh1213/leetcode-3.


This is a definitely a draft project to remember my progress in leetcode.  Appreciate the original owner who created the problem set. 

Intellij instructions.
 import from existing code, change to java 8 etc.
 
Debug Common.Main

 Adding a start class.
 When adding a new test class you can add it inside: 
 
 1. Adding a new class xxx which extends InvokableBase {}
 2. Implements these functions. 
   public run() 
   public int getPriority() {    return 0; /*yymmddhh- 15010100 */ }
   public Category getCategory()  {    return Category.notClassified;  }
 
 3. Inside this class, add your class.  
   CodePadJava/src/Common/Main.java      Main.addingAllNewClasses()
 
 4. It will call your class which is based on highest priority latest test case.


Adding JavaLangTestResference.txt

Tips for using two github accounts 
use gitlangzi0 to associate github host with you personal github public key;  You maintain two ssh config host file
when switching, cp that ssh key file you want your github.com to be assoicated with into the main ~/.ssh/config 
also cp ~/.gitconfigbians  into your <project folder>/.git/config to have correct user name for this project always in commit
&& cp ~/.ssh/config.langzi0 ~/.ssh/config'
./		../		.name		compiler.xml	misc.xml	modules.xml	vcs.xml		workspace.xml

