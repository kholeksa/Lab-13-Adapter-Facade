package ua.edu.ucu.apps.task3;

public class CompanyReader {
    private PDLReader reader;
    private BrandFetchReader fetcher;

    public CompanyReader() {
        this.reader = new PDLReader();
        this.fetcher = new BrandFetchReader();
    }
    public Company fetch(String companyName) {
        Company companyBF = fetcher.fetch(companyName);
        Company companyPDL = reader.fetch(companyName);
        return companyBF;
    }
}
