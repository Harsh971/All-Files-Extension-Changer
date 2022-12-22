import java.io.*;
class change{

public static void main(String []a)
{
	if(a.length<0)
	{
	System.out.println("\n[1]Folder Path [2] Current Extension [3] New Extension");
	return;
	}

	try{
	File fl= new File(a[0]);
	if(!fl.exists()){
	System.out.println("No Folder Founded");
	return;
	}

	String []files=fl.list();
	System.out.println("\n"+ files.length+" Files Founded");

	for(String f:files){
	File temp= new File(a[0]+"\\"+ f);
	if(temp.isFile()){
	String flnm= f.substring(0,f.lastIndexOf("."));
	String ext= f.substring(f.lastIndexOf(".")+1);
	System.out.println(ext+" = "+ a[1]);
	if(ext.equals(a[1]))
	flnm= flnm+"."+a[2];
	File newfile= new File(a[0]+"\\"+flnm);
	temp.renameTo(newfile);
	System.out.println("Renamed to "+ flnm);
	}
	}
	}catch(Exception e)
	{
	e.printStackTrace();
	}
} 
}