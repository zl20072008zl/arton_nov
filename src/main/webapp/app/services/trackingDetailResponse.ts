/**
 * Created by limingyang on 2017/7/23.
 */
export class TrackingDetailResponse {
    constructor(
        public city?: string,
        public province?: string,
        public status?: string,
        public date?: string,
        public time?: string,
        public signatoryName?: string
    ) {}
}
