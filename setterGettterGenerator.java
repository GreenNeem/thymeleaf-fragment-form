import java.lang.reflect.Field;
public class Main {
  int xx = 5;
  String yy ="sample";

  Object getValue(String typeStr){
    Object value =null;
        if(typeStr.contains("String")){
              value="test";
        }else if(typeStr.contains("int")){
              value=123;
        }
        return value;
  }
  String setStatement(String setObject,Field f,Boolean testFlg,String getObject){
   String resultStr=setObject;
        resultStr+=".set";
        resultStr+=f.getName().substring(0,1).toUpperCase();
        resultStr+=f.getName().substring(1);
        resultStr+="(";
        if(testFlg){
			resultStr+= getValue(f.getType().toString());
        }else{
        	resultStr+= getObject;
            resultStr+=".get";
            resultStr+=f.getName().substring(0,1).toUpperCase();
        	resultStr+=f.getName().substring(1);
            resultStr+="()";
        }
        resultStr+=")";
        return resultStr;
        
  }

  public static void main(String[] args) {
    Main myObj1 = new Main();

	for(Field f :myObj1.getClass().getDeclaredFields()){
        
    	System.out.println(myObj1.setStatement("AA",f,false,"BB"));
    }
  }
}
