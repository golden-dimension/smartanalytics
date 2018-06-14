package de.adorsys.smartanalytics.pers.mongo;

import de.adorsys.smartanalytics.pers.api.RuleEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Created by alexg on 07.02.17.
 */
@Profile({"mongo-persistence", "fongo"})
public interface RuleRepositoryMongodb extends MongoRepository<RuleEntity, String> {

    Optional<RuleEntity> getRuleByRuleId(String ruleId);
}