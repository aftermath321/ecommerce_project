public class StringResponse {

    private String response;

    public StringResponse(String s) { 
       this.response = s;
    }

    public String GetStringResponse() {
        return response;
    }

    public void SetStringResponse(String response) {
        this.response = response;
    }
}