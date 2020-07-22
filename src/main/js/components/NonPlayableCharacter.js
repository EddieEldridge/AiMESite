import React, { Component } from "react";
import '../../resources/static/css/npc.css';
import axios from 'axios';
import GifLoader from 'react-gif-loader';

// Import (Other)
import '../../resources/static/font/lotr.ttf'

// Import (Images)

// NPCList Component
class NonPlayableCharacter extends React.Component
{
  constructor(props) {
    super(props);

    // Define the variables to be stored in our state
    this.state = {
      nonPlayableCharacter: {}
    };

    // Declare these functions here so we can use them outside the constructor
	this.sendGenerateCharacterRequest = this.sendGenerateCharacterRequest.bind(this);

  }

  sendGenerateCharacterRequest() {
    axios.get('http://localhost:8080/api/generateCharacter').then((response) => {
            var npc = response.data;
            this.setState({
                nonPlayableCharacter: npc
            });
        })
        .catch(function (error) {
            console.log(error);
        });
}

componentDidMount() {
    this.sendGenerateCharacterRequest();
    }


	render() {
		return (
		<div>
      <div id="nameAndTitle">
        <h1>{this.props.nonPlayableCharacter.name}</h1>
          <h2>the {this.props.nonPlayableCharacter.title}</h2>
        </div>
        <table id="statsTable">
            <div id="infoTables">
                <table>
                      <tr id="leftTable">
                        <td><b>Status</b></td>
                        <td><b>Culture</b></td>
                        <td><b>Age</b></td>
                        <td><b>Gender</b></td>
                        <td><b>Weapon</b></td>
                      </tr>
                      <tr id="rightTable">
                        <td>{this.props.nonPlayableCharacter.status}</td>
                        <td>{this.props.nonPlayableCharacter.culture}</td>
                        <td>{this.props.nonPlayableCharacter.age}</td>
                        <td>{this.props.nonPlayableCharacter.gender}</td>
                        <td>{this.props.nonPlayableCharacter.weapon}</td>
                      </tr>             
                </table> 
            </div>
            <div id="statsDiv">
                <table id="statsTable">
                  <tbody>
                    <tr>
                      <th>Strength</th>
                      <th>Dexterity</th>
                      <th>Wisdom</th>
                      <th>Intelligence</th>
                      <th>Charisma</th>
                    </tr>
                    <tr>
                      <td>{this.props.nonPlayableCharacter.strength}</td>
                      <td>{this.props.nonPlayableCharacter.dexterity}</td>
                      <td>{this.props.nonPlayableCharacter.wisdom}</td>
                      <td>{this.props.nonPlayableCharacter.intelligence}</td>
                      <td>{this.props.nonPlayableCharacter.charisma}</td>
                    </tr>             
                  </tbody> 
                </table> 
            </div>
        </table>
		</div>
		)
	}
}

export default NonPlayableCharacter
