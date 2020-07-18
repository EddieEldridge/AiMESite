import React, { Component } from "react";
import '../../resources/static/css/npc.css';

// NPCList Component
class NonPlayableCharacter extends React.Component
{
	render() {
		return (
		<div>
		    <h1>{this.props.nonPlayableCharacter.name}</h1>
            <h2>the {this.props.nonPlayableCharacter.title}</h2>
            <p><b>Status:</b> {this.props.nonPlayableCharacter.status}</p>
            <p><b>Culture:</b> {this.props.nonPlayableCharacter.culture}</p>
            <p><b>Weapon:</b> {this.props.nonPlayableCharacter.weapon}</p>
            <p><b>Gender:</b> {this.props.nonPlayableCharacter.gender}</p>
            <p><b>Age:</b> {this.props.nonPlayableCharacter.age}</p>
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
		</div>
		)
	}
}

export default NonPlayableCharacter
