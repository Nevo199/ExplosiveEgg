package net.mcreator.explosivegg.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSkeletonRing2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("explosivegg", "model_skeleton_ring_2"),
			"main");
	public final ModelPart Helemet;

	public ModelSkeletonRing2(ModelPart root) {
		this.Helemet = root.getChild("Helemet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Helemet = partdefinition.addOrReplaceChild("Helemet",
				CubeListBuilder.create().texOffs(7, 32).addBox(-5.0F, 0.0F, -5.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(17, 34)
						.addBox(4.0F, 0.0F, -5.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(28, 35)
						.addBox(-5.0F, 0.0F, 4.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 38)
						.addBox(-4.0F, 0.0F, -5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Helemet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}