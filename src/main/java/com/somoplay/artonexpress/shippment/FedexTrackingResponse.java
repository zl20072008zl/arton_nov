package com.somoplay.artonexpress.shippment;

import java.util.List;

public class FedexTrackingResponse {
    private CpTrackSummeryResponse cpTrackSummeryResponse;
    private List<CpTrackDetailResponse> cpTrackDetailResponseList;

    public CpTrackSummeryResponse getCpTrackSummeryResponse() {
        return cpTrackSummeryResponse;
    }

    public void setCpTrackSummeryResponse(CpTrackSummeryResponse cpTrackSummeryResponse) {
        this.cpTrackSummeryResponse = cpTrackSummeryResponse;
    }

    public List<CpTrackDetailResponse> getCpTrackDetailResponseList() {
        return cpTrackDetailResponseList;
    }

    public void setCpTrackDetailResponseList(List<CpTrackDetailResponse> cpTrackDetailResponseList) {
        this.cpTrackDetailResponseList = cpTrackDetailResponseList;
    }
}
