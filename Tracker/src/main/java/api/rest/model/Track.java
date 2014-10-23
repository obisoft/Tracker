package api.rest.model;

import java.io.Serializable;
import java.util.Date;

public class Track implements Serializable{

    private static final long serialVersionUID = 1L;

    private Date dateTrackStart;
    private Date dateTrackStop;

    public Date getDateTrackStart() {
        return dateTrackStart;
    }
    public void setDateTrackStart(Date dateTrackStart) {
        this.dateTrackStart = dateTrackStart;
    }
    public Date getDateTrackStop() {
        return dateTrackStop;
    }
    public void setDateTrackStop(Date dateTrackStop) {
        this.dateTrackStop = dateTrackStop;
    }
}
