public abstract class DataSuoja implements IDataPaasy {

    protected IDataPaasy data;

    public DataSuoja(IDataPaasy data) {
        this.data = data;
    }

    public IDataPaasy hae() {
        return data.hae();
    }

}
