package kr.uniton.Domain.menu;

import lombok.*;

import javax.persistence.*;

/**
 * Created by iljun on 2017-07-29.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "menu")
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menuNo")
    private Long menuNo;

    @Column(name = "emotion")
    private Long emotion;

    @Column(name = "name")
    private String name;

    @Column(name = "imageUrl")
    private String imageUrl;

    public static Menu build(Long emotion, String name, String imageUrl) {
        return Menu.builder()
                .emotion(emotion)
                .name(name)
                .imageUrl(imageUrl)
                .build();
    }
}
