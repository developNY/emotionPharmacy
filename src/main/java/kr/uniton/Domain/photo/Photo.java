package kr.uniton.Domain.photo;


import lombok.*;

import javax.persistence.*;

/**
 * Created by iljun on 2017-07-29.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "photo")
@Entity
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "photoNo")
    private Long photoNo;

    @Column(name = "emotion")
    private Long emotion;

    @Column(name = "name")
    private String name;

    @Column(name = "imageUrl")
    private String imageUrl;

    public static Photo build(Long emotion, String name, String imageUrl) {
        return Photo.builder()
                .emotion(emotion)
                .name(name)
                .imageUrl(imageUrl)
                .build();
    }
}
