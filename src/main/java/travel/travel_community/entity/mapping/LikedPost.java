package travel.travel_community.entity.mapping;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import travel.travel_community.entity.User;
import travel.travel_community.entity.baseEntity.AbstractLikedPost;
import travel.travel_community.entity.baseEntity.TimeEntity;
import travel.travel_community.entity.posts.TravelPost;

import java.time.LocalDateTime;

@Entity
@Table(name = "liked_posts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LikedPost extends AbstractLikedPost {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private TravelPost post;
}