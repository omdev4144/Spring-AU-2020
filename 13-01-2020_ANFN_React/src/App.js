import React, { Component } from 'react';
import './App.css';
import Data from './data.json';
import Child from "./Child"
import {connect} from 'react-redux';
class App extends Component {
  constructor(props){
    super(props)
  }
  render(){
  return (
  <div>
  <b>ENTER CITY:</b><input type='text' onChange={this.props.filter_cities} value={this.props.userinput}/><br/><br/>
  <table className='table_main'>
      <thead>
        <tr>
          <td>Id</td>
          <td>Country</td>
          <td>State</td>
          <td>City</td>
        </tr>  
      </thead>
      <tbody>
         {
        Data.filter((data,index)=>{
          const reg=new RegExp(this.props.userinput,"i");
          return reg.test(data.city);
        }).map((data,index)=>{
          return (
             <tr key={index} onClick={this.props.showdata.bind(this,data)}>
                <td>{index}</td>
                <td>{data.country}</td>
                <td>{data.state}</td>
                <td>{data.city}</td>
             </tr>   
          )
        })
         }
         
      </tbody>      
  </table>
  <Child state={this.props.displaydata}/>
  </div>  
  );}
}
const mapsStateToProps=(state)=>{
 return{
    userinput:state.userinput,
    displaydata:state.displaydata
 }
}
const mapDispatchToProps=dispatch=>{
  return{
    filter_cities:({target})=>dispatch({type:'PUSH',val:target.value}),
    showdata:(data)=>dispatch({type:'ADD_ELE',val:data})
  }
}
export default connect(mapsStateToProps,mapDispatchToProps)(App);