package kr.uniton.Domain.playList;

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
@Table(name = "playList")
@Entity
public class PlayList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playNo")
    private Long playNo;

    @Column(name = "emotion")
    private Long emotion;

    @Column(name = "title")
    private String title;

    @Column(name = "artist")
    private String artist;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "youtubeUrl")
    private String youtubeUrl;

}
