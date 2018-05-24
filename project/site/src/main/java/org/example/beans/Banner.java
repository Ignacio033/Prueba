package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
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

@XmlRootElement(name = "banner")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "project:bannerdocument")
@Node(jcrType = "project:bannerdocument")
public class Banner extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "project:title")
    public String getTitle() {
        return getProperty("project:title");
    }

    @XmlJavaTypeAdapter(HippoHtmlAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "project:content")
    public HippoHtml getContent() {
        return getHippoHtml("project:content");
    }

    @HippoEssentialsGenerated(internalName = "project:link")
    public HippoBean getLink() {
        return getLinkedBean("project:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "project:image")
    public Imageset getImage() {
        return getLinkedBean("project:image", Imageset.class);
    }
}
