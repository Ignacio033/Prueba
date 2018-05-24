package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "project:imageset")
@Node(jcrType = "project:imageset")
public class Imageset extends HippoGalleryImageSet {
    @HippoEssentialsGenerated(internalName = "project:small")
    public HippoGalleryImageBean getSmall() {
        return getBean("project:small", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "project:large")
    public HippoGalleryImageBean getLarge() {
        return getBean("project:large", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "project:smallsquare")
    public HippoGalleryImageBean getSmallsquare() {
        return getBean("project:smallsquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "project:mediumsquare")
    public HippoGalleryImageBean getMediumsquare() {
        return getBean("project:mediumsquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "project:largesquare")
    public HippoGalleryImageBean getLargesquare() {
        return getBean("project:largesquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "project:banner")
    public HippoGalleryImageBean getBanner() {
        return getBean("project:banner", HippoGalleryImageBean.class);
    }
}
