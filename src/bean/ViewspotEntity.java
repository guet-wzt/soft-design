package bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "viewspot", schema = "softsight", catalog = "")
public class ViewspotEntity {
    private int id;
    private String name;
    private String city;
    private String cityurl;
    private String place;
    private String intro;
    private String photo;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "cityurl")
    public String getCityurl() {
        return cityurl;
    }

    public void setCityurl(String cityurl) {
        this.cityurl = cityurl;
    }

    @Basic
    @Column(name = "place")
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Basic
    @Column(name = "intro")
    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewspotEntity that = (ViewspotEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(city, that.city) &&
                Objects.equals(cityurl, that.cityurl) &&
                Objects.equals(place, that.place) &&
                Objects.equals(intro, that.intro) &&
                Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, cityurl, place, intro, photo);
    }
}
