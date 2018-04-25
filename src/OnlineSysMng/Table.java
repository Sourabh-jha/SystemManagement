package OnlineSysMng;

public class Table {
    private int Lab_No;
    private int System_No;
    private String Component;
    private int Lab_Assistant_Id;
    
public Table(int TLab_No, int TSystem_No, String TComponent, int TAssistantId)
{
this.Lab_No=TLab_No;
this.System_No=TSystem_No;
this.Component=TComponent;
this.Lab_Assistant_Id=TAssistantId;
}
public int getLabNo()
{
    return Lab_No;
}
public int getSystemNo()
{
    return System_No;
}
public String getComponent()
{
    return Component;
}
public int getAssistantId()
{
    return Lab_Assistant_Id;
}
}
