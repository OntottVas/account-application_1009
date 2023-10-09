package hu.progmatic.accountapplication_1009.service;

import hu.progmatic.accountapplication_1009.model.Owner;
import hu.progmatic.accountapplication_1009.repository.OwnerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OwnerService {
    private OwnerRepository ownerRepository;

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public Owner getOwnerById(Long id) throws Exception {
        return ownerRepository.findById(id).orElseThrow(() -> new Exception("Owner not found by: " + id + " id"));
    }

    public void addNewOwner(Owner owner) {
        ownerRepository.save(owner);
    }

    public void modifyOwnerName(Long id, String newName) throws Exception {
        Owner owner = getOwnerById(id);
        owner.setName(newName);
        ownerRepository.save(owner);
    }

    public void modifyOwnerEmail(Long id, String newEmail) throws Exception {
        Owner owner = getOwnerById(id);
        owner.setEmail(newEmail);
        ownerRepository.save(owner);
    }

    public void deleteOwner(Long id) {
        ownerRepository.deleteById(id);
    }
}
