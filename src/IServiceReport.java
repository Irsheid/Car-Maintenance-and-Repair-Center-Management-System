public interface IServiceReport extends IServiceReportList {
    void addServiceReport(int appointment, String repairsPerformed, String partsUsed);
}