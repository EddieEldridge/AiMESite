import React, { Component } from "react";
import '../../resources/static/css/home.css';

// Banner Image
class Home extends React.Component{
    render(){
       return(
           <div className="gandalf">
              <h1>Mae g'ovannen!</h1>
              {/* <img id="gandalfGif" src="/image/gandalf.gif" alt="this slowpoke moves" /> */}
              <div id="textContent">
                  <h2>What is the purpose of this website?</h2>
                    <div id="textPargraphs"> 
                    Hello and welcome to my website about Adventures in Middle Earth
                  Hello and welcome to my website about Adventures in Middle Earth
                  Hello and welcome to my website about Adventures in Middle Earth
                  Hello and welcome to my website about Adventures in Middle Earth

                    </div>

                  <h2>What is Adventures in Middle-Earth?</h2>
                  Hello and welcome to my website about Adventures in Middle Earth
                  Hello and welcome to my website about Adventures in Middle Earth
                  Hello and welcome to my website about Adventures in Middle Earth
                  Hello and welcome to my website about Adventures in Middle Earth

                  <h2>How does it differ from standard D&D 5e?</h2>
                  Hello and welcome to my website about Adventures in Middle Earth
                  Hello and welcome to my website about Adventures in Middle Earth
                  Hello and welcome to my website about Adventures in Middle Earth
                  Hello and welcome to my website about Adventures in Middle Earth
                  Hello and welcome to my website about Adventures in Middle Earth
                  
              </div>
           </div>
           
    )
    }
}

export default Home