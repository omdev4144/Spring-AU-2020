const initstate={
    displaydata:[],
    userinput:"",
}
const reducer=(state=initstate,action)=>{
    //console.log(action.val);
    switch(action.type){
        case 'PUSH':
            return{
                ...state,
                userinput:action.val
            }
            break;
        case 'ADD_ELE':
               return{
                    ...state,
                    displaydata:state.displaydata.concat(action.val)
               }  
               break;  
        default:
            return state;     
    }
}
export  default reducer;