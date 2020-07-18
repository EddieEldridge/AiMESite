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
                    <Link to="/homePage">Home</Link>
                    <Link to="/characters">Characters</Link>
                    <Link to="/generateNPC">Generator</Link>
                    <Link to="/guides">Guides</Link>
                    <Link to="/about">About</Link>
            </div>

        );
    }
}

export default NavBar