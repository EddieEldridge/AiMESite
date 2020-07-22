const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

// Import (Other)
import '../resources/static/font/lotr.ttf'

// Imports (Libraries)
import {
    HashRouter as Router,
    Switch,
    Link
  } from "react-router-dom";
import {Route} from 'react-router'
import axios from 'axios';
import { trackPromise} from 'react-promise-tracker';

// Imports (Bootstrap)
import 'bootstrap/dist/css/bootstrap.min.css';
import '../resources/static/css/main.css';

// Imports (Components)
import NavBar from './components/NavBar';
import Banner from './components/Banner';
import Button from 'react-bootstrap/Button';
import Background from './components/Background';
import NonPlayableCharacter from './components/NonPlayableCharacter';
import Home from './components/Home';
import CharacterProfile from './components/CharacterProfile';
import CharacterList from './components/CharacterList';

// App component
class App extends React.Component {
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
            trackPromise(
                    axios.get('http://localhost:8080/api/generateCharacter').then((response) => {
                        var npc = response.data;
                        this.setState({
                            nonPlayableCharacter: npc
                        });
                    })
                    .catch(function (error) {
                        console.log(error);
                    })
            );
        }

        componentDidMount() {
            this.sendGenerateCharacterRequest();
        }

	render() {
		return (
            <Router>
            <Background />
            <Banner />
            <NavBar />
            <div>
                <Container>
                        <Route path="/homePage">
                            <Home/>
                        </Route>
                        <Route path="/generateNPC">
                            <div id="npcInfo">
                                <NonPlayableCharacter nonPlayableCharacter={this.state.nonPlayableCharacter} />
                                <div id="generateButton">
                                    <Button  style={{justifyContent: 'center'}} id="generateButton" onClick={this.sendGenerateCharacterRequest} id='generateButton' variant="dark">Generate</Button>
                                </div>
                            </div>
                        </Route>
                        <Route path="/characterList">
                            <div id="characterInformation">
                                <CharacterList characterList={this.state.characterList} />
                            </div>
                        </Route>
                </Container>                   
             </div>
        </Router>
        
		)
	}
}

// Container
class Container extends React.Component{
    render(){
       return(
           <div id="container">
              {this.props.children}
           </div>
    )
    }
}


// Render
ReactDOM.render(<Router><App /></Router>, document.getElementById("react"));