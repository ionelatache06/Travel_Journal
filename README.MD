# Travel Journal

Main features:  
&nbsp;&nbsp;&nbsp;• all the data from the app is saved in a Firebase Cloud Firestore  
&nbsp;&nbsp;&nbsp;• the favourite trips are also saved locally in an SQLite database by using Room  

![Firestore](https://github.com/andreivatamanu/Travel-Journal-Project/blob/master/screenshots/storage.png)
  
 • Sign In  
 &nbsp;&nbsp;&nbsp;-> upon opening the app, if the user is not already signed in, the main activity will send you to the Sign In activity  
 &nbsp;&nbsp;&nbsp;-> implements authentication using the Google account with Firebase Authentication 
 
 ![Sign in With Google](https://github.com/andreivatamanu/Travel-Journal-Project/blob/master/screenshots/Screenshot_1555136894.png)
    
• Navigation Drawer (main activity)  
&nbsp;&nbsp;&nbsp;-> the header displays the profile pic, the e-mail address and the name of the Google account used to sign in.  
&nbsp;&nbsp;&nbsp;-> the body contains the following items  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Home - leads to the home screen of the app  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- it's a RecyclerView that displays the list of trips  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- each RecyclerView item contains a small bookmark image that lets you add the trip to favourites  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Favourite - the same home screen, but the query of the RecyclerView's adapter is changed to display only the trips marked as favourite  
![main screen](https://github.com/andreivatamanu/Travel-Journal-Project/blob/master/screenshots/Screenshot_1555136820.png)                                         ![favourites_screen](https://github.com/andreivatamanu/Travel-Journal-Project/blob/master/screenshots/Screenshot_1555136832.png)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- About us  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Contact us  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Sign out - signs out of the Google account  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Share  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Send  
      
• Add or Edit Trip  
&nbsp;&nbsp;&nbsp;-> the home screen contains a Floating Action Button that leads to this activity  
&nbsp;&nbsp;&nbsp;-> each RecyclerView item can be edited when long clicked  
&nbsp;&nbsp;&nbsp;-> contains the following fields:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Trip Name (EditText input)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Destination (EditText input)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Trip Type (radio group with 3 choices: City Break, Seaside, Mountains)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Price (slider)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Start Date (custom date picker)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- End Date (custom date picker)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Rating (rating bar)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- An Image (either selected from the gallery, or taken using a camera intent)  
&nbsp;&nbsp;&nbsp;-> Once clicked, the save button sends all the data back to the main activity, which will either add or edit the trip in the Cloud Firestore  

![add_or edit screen](https://github.com/andreivatamanu/Travel-Journal-Project/blob/master/screenshots/Screenshot_1555136882.png)  
   
 • View Trip  
&nbsp;&nbsp;&nbsp;-> when clicked, each RecyclerView item displays the detalis of the trip in read only mode  

![view trip screen](https://github.com/andreivatamanu/Travel-Journal-Project/blob/master/screenshots/Screenshot_1555136869.png)  
  
    
