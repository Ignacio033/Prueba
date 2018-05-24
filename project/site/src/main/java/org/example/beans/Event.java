package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import java.util.Calendar;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.example.beans.Imageset;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onehippo.cms7.essentials.components.rest.adapters.HippoHtmlAdapter;

@XmlRootElement(name = "event")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "project:Event")
@Node(jcrType = "project:Event")
public class Event extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "project:title")
    public String getTitle() {
        return getProperty("project:title");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "project:date")
    public Calendar getDate() {
        return getProperty("project:date");
    }

    @XmlJavaTypeAdapter(HippoHtmlAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "project:content")
    public HippoHtml getContent() {
        return getHippoHtml("project:content");
    }

    @HippoEssentialsGenerated(internalName = "project:place")
    public HippoBean getPlace() {
        return getLinkedBean("project:place", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "project:imagelink")
    public Imageset getImagelink() {
        return getLinkedBean("project:imagelink", Imageset.class);
    }
}
