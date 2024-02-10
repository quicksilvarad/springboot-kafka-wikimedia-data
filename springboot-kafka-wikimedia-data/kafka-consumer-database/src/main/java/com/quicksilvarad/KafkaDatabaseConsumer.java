package com.quicksilvarad;

import com.quicksilvarad.entity.WikimediaData;
import com.quicksilvarad.repository.WikiDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
    private WikiDataRepository wikiDataRepository;

    @Autowired
    public  KafkaDatabaseConsumer(WikiDataRepository wikiDataRepository)
    {
        this.wikiDataRepository=wikiDataRepository;

    }
    @KafkaListener(topics="${spring.kafka.topic.name}" , groupId = "spring.kafka.group-id")
    public void consume(String eventMessage)
    {
      LOGGER.info(String.format("Message consumed -> %s",eventMessage));
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);
        wikiDataRepository.save(wikimediaData);
    }
}
