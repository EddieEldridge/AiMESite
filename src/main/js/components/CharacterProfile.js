import React from "react";

import {
    BrowserRouter as Router,
    Switch,
    Link
  } from "react-router-dom";

import 'bootstrap/dist/css/bootstrap.min.css';

class CharacterProfile extends React.Component{
 
    constructor(props) {
        super(props);
    
        // Define the variables to be stored in our state
        this.state = {
          currentCharacter: "None",
          characterName: "",
          chracterTitle: "",
        };
    }

    render(){
        return(
            <div className="characterList">
                <ul>
                    <li><Link to="/characterProfiles/Cirion_of_Arthedain">Cirion of Arthedain</Link></li> 
                    <li><Link to="/characterProfiles/Cirion_of_Arthedain">Cirion of Arthedain</Link></li> 
                    <li><Link to="/characterProfiles/Cirion_of_Arthedain">Cirion of Arthedain</Link></li> 
                    <li><Link to="/characterProfiles/Cirion_of_Arthedain">Cirion of Arthedain</Link></li> 
                    <li><Link to="/characterProfiles/Cirion_of_Arthedain">Cirion of Arthedain</Link></li> 
                    <li><Link to="/characterProfiles/Cirion_of_Arthedain">Cirion of Arthedain</Link></li> 
                </ul>
            </div>
        )
    }
}


export default CharacterProfile