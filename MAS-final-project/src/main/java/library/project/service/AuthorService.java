package library.project.service;

import library.project.model.Creator;
import library.project.repository.CreatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class AuthorService {

    private final CreatorRepository creatorRepository;

    public List<Creator> getAllAuthors() {
       Iterable<Creator> allAuthors = creatorRepository.findAll();
        List<Creator> res = new ArrayList<>();
        allAuthors.forEach(res :: add);
        return res;
    }
}
