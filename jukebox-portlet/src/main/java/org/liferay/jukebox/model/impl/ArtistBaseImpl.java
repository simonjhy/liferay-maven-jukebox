package org.liferay.jukebox.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.liferay.jukebox.model.Artist;
import org.liferay.jukebox.service.ArtistLocalServiceUtil;

/**
 * The extended model base implementation for the Artist service. Represents a row in the &quot;jukebox_Artist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ArtistImpl}.
 * </p>
 *
 * @author Julio Camarero
 * @see ArtistImpl
 * @see org.liferay.jukebox.model.Artist
 * @generated
 */
public abstract class ArtistBaseImpl extends ArtistModelImpl implements Artist {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a artist model instance should use the {@link Artist} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ArtistLocalServiceUtil.addArtist(this);
        } else {
            ArtistLocalServiceUtil.updateArtist(this);
        }
    }
}
