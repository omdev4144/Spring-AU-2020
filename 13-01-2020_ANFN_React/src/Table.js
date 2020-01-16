import React,{Component} from 'react';

class Table extends Component{
    render(){
        const {CharecterData}=this.props;
        console.log(CharecterData);
        return (
            <table>
                 <Tableheader/>
                 <Tablebody CharecterData={CharecterData}/>
            </table>
        )
    }
}
const Tableheader=()=>{
    return(
        <thead>
               <tr>
                   <th>name</th>
                   <th>Job</th> 
               </tr>
        </thead>
    )
}
const Tablebody = props => {
    const rows = props.CharecterData.map((row, index) => {
      return (
        <tr key={index}>
          <td>{row.name}</td>
          <td>{row.job}</td>
        </tr>
      )
    })
  
    return <tbody>{rows}</tbody>
    
  }
export default Table