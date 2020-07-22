import React, { Component } from "react";
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
  } from "react-router-dom";

// NavBar
class NavBar extends React.Component{
    render() {
        return (
            <div className="topnav">
                <div className="topNavItems">
                    <Link to="/homePage">Home</Link>
                    <Link to="/characterList">Characters</Link>
                    <Link to="/generateNPC">Generator</Link>
                    <Link to="/guides">Guides</Link>
                    <Link to="/resources">Resources</Link>
                    <Link to="/about">About</Link>
                </div>
            </div>

        );
    }
    
}

export default NavBar