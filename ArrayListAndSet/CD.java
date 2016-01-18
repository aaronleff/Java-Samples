package ArrayListAndSet;


public class CD {
    private int id;
    private String artist;
    private String albumTitle;

    public CD(int i, String a, String t) {
        id = i;
        artist = a;
        albumTitle = t;
    }

    @Override
    public String toString() {
        return "CD [id=" + id + ", artist=" + artist + ", album title="
                + albumTitle + "]";
    }

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((albumTitle == null) ? 0 : albumTitle.hashCode());
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CD other = (CD) obj;
		if (albumTitle == null) {
			if (other.albumTitle != null)
				return false;
		} else if (!albumTitle.equals(other.albumTitle))
			return false;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
*/
}