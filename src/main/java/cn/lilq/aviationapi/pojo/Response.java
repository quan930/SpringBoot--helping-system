package cn.lilq.aviationapi.pojo;

import java.util.List;

public class Response {
    private String errorMsg;
    private List<BandFinding> bandFindings;
    private List<HelpAnd> helpAnds;

    public Response() {
    }

    public Response(String errorMsg, List<BandFinding> bandFindings, List<HelpAnd> helpAnds) {
        this.errorMsg = errorMsg;
        this.bandFindings = bandFindings;
        this.helpAnds = helpAnds;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<BandFinding> getBandFindings() {
        return bandFindings;
    }

    public void setBandFindings(List<BandFinding> bandFindings) {
        this.bandFindings = bandFindings;
    }

    public List<HelpAnd> getHelpAnds() {
        return helpAnds;
    }

    public void setHelpAnds(List<HelpAnd> helpAnds) {
        this.helpAnds = helpAnds;
    }
}
