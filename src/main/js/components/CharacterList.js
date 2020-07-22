import React from "react";

import {
    BrowserRouter as Router,
    Switch,
    Link
  } from "react-router-dom";

import 'bootstrap/dist/css/bootstrap.min.css';
import '../../resources/static/css/characterList.css';

class CharacterList extends React.Component{
 
    constructor(props) {
        super(props);
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


export default CharacterList