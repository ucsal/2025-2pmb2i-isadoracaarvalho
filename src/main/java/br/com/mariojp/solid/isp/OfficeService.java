package br.com.mariojp.solid.isp;

public class OfficeService {
    private final IPrint device;
    public OfficeService(IPrint device){ this.device = device; }
    public void printReport(String content){
        device.print(content);
        // BUG: chama scan sem necessidade
        // device.scan("audit.txt");
    }
}
