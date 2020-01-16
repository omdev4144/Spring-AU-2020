import React, { Component } from 'react';
import {connect} from 'react-redux';
import './App.css'
class child extends Component{
  constructor(props){
    super(props)
  }
    render(){
      if(this.props.display_data.length>0){
        console.log(this.props.display_data);
         return(
         <div className='div1'>
           <h1>Rows</h1>  
          <table>
               <thead>
                 <tr> 
                  <td>ID</td>
                  <td>Country</td>
                  <td>State</td>
                  <td>city</td>
                </tr>
              </thead>    
          <tbody>
               {
                this.props.display_data.map((elem,index)=>{
                  return(
                    <tr key={index}>
                        <td>{index}</td>
                        <td>{elem.country}</td>
                        <td>{elem.state}</td>
                        <td>{elem.city}</td>
                    </tr>  
                  )
                })        
               }
          </tbody>
          </table>
          </div>
        )
    }
    else{
      return <div>select a row</div>
    }
  }
  
}
const mapStateToProps=(state)=>{
  return {
    display_data:state.displaydata,
    userinput:state.userinput   
  }
}
export default connect(mapStateToProps)(child);
